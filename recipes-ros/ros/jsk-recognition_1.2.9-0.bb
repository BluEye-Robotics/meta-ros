DESCRIPTION = ""
AUTHOR = "Ryohei Ueda"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "checkerboard-detector imagesift jsk-pcl-ros jsk-perception resized-image-transport jsk-recognition-msgs jsk-recognition-utils"

RDEPENDS_${PN} = "checkerboard-detector imagesift jsk-pcl-ros jsk-perception resized-image-transport jsk-recognition-msgs jsk-recognition-utils"

SRC_URI = "https://github.com/tork-a/jsk_recognition-release/archive/release/melodic/jsk_recognition/1.2.9-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "6c0690eecccd9d2cfe86253e09606dec"
SRC_URI[sha256sum] = "179689ba0dd1998592ea7d6dc67c3fee6314be4d42578e683fb8f3c0fc997dab"

S = "${WORKDIR}/jsk_recognition-release-release-melodic-jsk_recognition-1.2.9-0"

inherit catkin
