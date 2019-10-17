DESCRIPTION = ""
AUTHOR = "Ryohei Ueda"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "euslisp geneus roseus"

RDEPENDS_${PN} = "euslisp geneus roseus"

SRC_URI = "https://github.com/tork-a/jsk_roseus-release/archive/release/melodic/jsk_roseus/1.7.4-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "7039d74a248ed9e5afc636fceb7ef9ca"
SRC_URI[sha256sum] = "c72f89169571ed31e8051108300d8c87d656c9f72df5d91e96bd8ec808c796a4"

S = "${WORKDIR}/jsk_roseus-release-release-melodic-jsk_roseus-1.7.4-0"

inherit catkin
