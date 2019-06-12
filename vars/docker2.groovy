

/**
 *
 * Docker functions
 *
 */
/**
* Build step to build docker image
*
* @param dockerHubImg Name of image on dockerhub
* @param defaultImg   Image to use if dockerHubImg is not found
* @return img
*/
 def getImage(dockerHubImg, defaultImg="ubuntu:latest"){
   def img
   try {
     img = docker.image(dockerHubImg)
     img.pull()
   } catch (Throwable e){
     img = docker.image(defaultImg)

   }
   return img
 }
