$(document).ready(function () {

    $('.btnAddToBasket').click( function () {
        var productId=$(this).attr('pId');
 
        var xhttp = new XMLHttpRequest();
        xhttp.onreadystatechange = function() {
           if (this.readyState == 4 && this.status == 200) {
          var basketCount=thid.attr
   }
        };
        xhttp.open("POST", "/first_web_project/product-controller?action=addBasket&productId="+productId, true);
        xhttp.send();

});


});