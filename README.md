Ooyala AdobeCQ Connector
========================

<dl>
	<dt>Compatibility</dt>
	<dd>Adobe CQ 5.5</dd>

	<dt>Usage</dt>
	<dd>A pre built package is available through github by clicking the download link above. Install the zip file into CQs package manager. Configuration instructions are available in documentation/Ooyala-AdobeCQ-Documentation.pdf</dd>
</dl>

Building from Source
====================
<dl>
	<dt>Requirements</dt>
	<dd>Maven.</dd>

	<dt>Build</dt>
	<dd>Clone the repository. Execute 'mvn install' in the parent directory (Ooyala-AdobeCQ).</dd>

	<dt>Deploy</dt>
	<dd>You can automatically deploy to the local CQ instance on any unix machine capable of running a bash script. CD into /cqpackage dir, and execute './buildCqPackage.sh'. Note: be sure the file has executable permissions. All CQ connection parameters are exposed clearly within this script for customization.</dd>
</dl>


Built by Siteworx. http://www.siteworx.com