#!/bin/bash -x
###############################################################################

PARENT_PROJECT_NAME="ooyala"

CQ_HOST="localhost"
CQ_PORT="4502"
CQ_USERNAME="admin"
CQ_PASSWORD="admin"

UI_PROJECT_NAME="ui"
UI_PROJECT_PATH="../$UI_PROJECT_NAME"
UI_PROJECT_VERSION="1.0"
UI_PROJECT_JAR="$PARENT_PROJECT_NAME-$UI_PROJECT_NAME-$UI_PROJECT_VERSION.jar"

OSGI_PROJECT_NAME="osgi"
OSGI_PROJECT_PATH="../$OSGI_PROJECT_NAME"
OSGI_PROJECT_VERSION="0.0.1"
OSGI_PROJECT_JAR="$PARENT_PROJECT_NAME-$OSGI_PROJECT_NAME-$OSGI_PROJECT_VERSION.jar"

USER="Siteworx Inc."
PACKAGE_NAME="Ooyala Package"
PackageRelease="$OSGI_PROJECT_VERSION"

PACKAGE_NAME="Ooyala.zip"
PACKAGE_INSTALL_DIR="jcr_root/apps/$PARENT_PROJECT_NAME/install"

###############################################################################
if [ `basename $PWD` != "cqpackage" ]; then
	echo 'This script should be run from cqpackage'
	exit 1
fi

if [ ! -d target ]; then
	mkdir target
else
	rm -rf target/*
fi

if [ ! -d $PACKAGE_INSTALL_DIR ]; then
	mkdir -p $PACKAGE_INSTALL_DIR
else
	rm $PACKAGE_INSTALL_DIR/*
fi

sed -e "s|_user_|$USER|" -e "s|_name_|$PARENT_PROJECT_NAME|" -e "s|_release_|$PackageRelease|" META-INF/vault/properties.xml.skeleton > META-INF/vault/properties.xml

cp $OSGI_PROJECT_PATH/target/$OSGI_PROJECT_JAR $PACKAGE_INSTALL_DIR
cp $UI_PROJECT_PATH/target/$UI_PROJECT_JAR target


zip -r target/$UI_PROJECT_JAR jcr_root META-INF
mv target/$UI_PROJECT_JAR target/$PACKAGE_NAME

url='http://localhost:4502/crx/packmgr/service/.json/?cmd=upload&force=true'

echo "Uploading Ooyala Package to CRX"
curl -u $CQ_USERNAME:$CQ_PASSWORD -F file=@target/$PACKAGE_NAME -F name=$PACKAGE_NAME -F force=true -F install=true http://$CQ_HOST:$CQ_PORT/crx/packmgr/service.jsp
