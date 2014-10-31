/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*

$(document).ready(function (){
    $("#act-tra").click(function(){
      $.ajax({
         url:'GTrabajador',
         method:'post',
         data:{
             nombre:$('#nombre').val(),
             paterno:$('#paterno').val(),
             materno:$('#materno').val()
         },
         success:function(respuesta){
             $("#respuestaG").html(respuesta);
             alert("tony");
             
             
         }
          
      });
   }); 
});*/
$(document).ready(function (){
    $("#act-tra").click(function(){
      $.ajax({
         url:'GTrabajador',
         method:'post',
         data:{
             nombre:'sergio',
             paterno:'rodriguez',
             materno:'cuevas'
         },
         success:function(respuesta){
             $("#respuestaG").html(respuesta);
             
             
             
         }
          
      });
   }); 
});