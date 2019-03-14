DESCRIPTION = "ml_classifiers"
AUTHOR = "Scott Niekum"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation roslint std-msgs roscpp roslib pluginlib libeigen"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/astuff/ml_classifiers-release/archive/release/melodic/ml_classifiers/0.4.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "7c1582712fb1081cb7dad552fe73705a"
SRC_URI[sha256sum] = "d2ff2bb82ef058b476e9b0ca97006a18aae8e0d7c4e16401a6b87300680331cf"

S = "${WORKDIR}/ml_classifiers-release-release-melodic-ml_classifiers-0.4.0-0"

inherit catkin
