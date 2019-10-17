DESCRIPTION = "Library to compute SIFT features"
AUTHOR = "zerofrog"
SECTION = "devel"
LICENSE = "LGPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "python-numpy subversion mk boost rosboost-cfg rospack roslib python-numpy boost"

RDEPENDS_${PN} = "python-numpy boost"

SRC_URI = "https://github.com/tork-a/jsk_3rdparty-release/archive/release/melodic/libsiftfast/2.1.12-2.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a6d82e28aed978cc710dcfa2ba47fb98"
SRC_URI[sha256sum] = "ba74af41bea5e114a440d898d100f7b08a7f5b44010fc8c9e31142fd5b0f2ab6"

ROS_SPN = "jsk_3rdparty"
S = "${WORKDIR}/jsk_3rdparty-release-release-melodic-libsiftfast-2.1.12-2"

inherit catkin
