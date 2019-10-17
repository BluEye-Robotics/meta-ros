DESCRIPTION = "roseus_tutorials"
AUTHOR = "Manabu Saito"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roseus uvc-camera ar-track-alvar opencv-apps checkerboard-detector image-proc image-view2 posedetection-msgs visualization-msgs jsk-recognition-msgs"

RDEPENDS_${PN} = "uvc-camera ar-track-alvar opencv-apps checkerboard-detector image-proc image-view2 posedetection-msgs visualization-msgs jsk-recognition-msgs"

SRC_URI = "https://github.com/tork-a/jsk_roseus-release/archive/release/melodic/roseus_tutorials/1.7.4-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "1e34659a2b86e93e262d6b3ff928355d"
SRC_URI[sha256sum] = "636febaa5696e25a61c0a8ecb98ecff1de97646c6d8b255956b3013758fd6be8"

ROS_SPN = "jsk_roseus"
S = "${WORKDIR}/jsk_roseus-release-release-melodic-roseus_tutorials-1.7.4-1"

inherit catkin
