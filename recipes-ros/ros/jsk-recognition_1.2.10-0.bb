DESCRIPTION = ""
AUTHOR = "Ryohei Ueda"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "checkerboard-detector imagesift jsk-pcl-ros jsk-perception resized-image-transport jsk-recognition-msgs jsk-recognition-utils"

RDEPENDS_${PN} = "checkerboard-detector imagesift jsk-pcl-ros jsk-perception resized-image-transport jsk-recognition-msgs jsk-recognition-utils"

SRC_URI = "https://github.com/tork-a/jsk_recognition-release/archive/release/melodic/jsk_recognition/1.2.10-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "03143bd5cb8b0ac2a708060aacf5d868"
SRC_URI[sha256sum] = "abcd88e0a0d3f5f13a04503b9910baa644e4f6044ba3987b0026eac7c198a88d"

S = "${WORKDIR}/jsk_recognition-release-release-melodic-jsk_recognition-1.2.10-0"

inherit catkin
