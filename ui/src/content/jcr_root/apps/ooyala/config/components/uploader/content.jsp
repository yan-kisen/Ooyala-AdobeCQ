<div>
  <label for="assetName">Name: </label>
  <input type="text" id="assetName" value="" placeholder="Name"/>
  <label for="assetDescription">Description: </label>
  <input type="text" id="assetDescription" value="" placeholder="Description"/>
  <a id="selectAsset"><button>Select Asset</button></a>
</div>
<div>
  <button id="upload" onclick="upload();">Upload</button>
</div>
<div id="progress"></div>
<script type="text/javascript">
  window.uploader = new Ooyala.Client.AssetCreator('/bin/ooyala/upload', 'selectAsset');

  uploader.on("progress", function(){
    $("#progress").text(uploader.progress());
  });

  uploader.on("error", function(err){console.log(err)});

  uploader.on("assetCreationComplete", function(){
    uploader.upload();
  });

  function upload(){
    uploader.prepareUpload($("#assetName").val(), $("#assetDescription").val());
  }
</script>