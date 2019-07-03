DESCRIPTION = "Parameter/Structure Estimation and Inference for Bayesian Belief Network"
AUTHOR = "Yuki Furuta"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "rospy python-scipy message-generation python-libpgm-pip rospy python-scipy message-runtime"

RDEPENDS_${PN} = "python-libpgm-pip rospy python-scipy message-runtime"

SRC_URI = "https://github.com/tork-a/jsk_3rdparty-release/archive/release/melodic/pgm_learner/2.1.12-2.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "0d7017fb1a3710372d48712d083d6f61"
SRC_URI[sha256sum] = "4befdf8d35ad31c64bbf3e831c7937f3e2d5e0857ba69d821e628eefb3f94937"

ROS_SPN = "jsk_3rdparty"
S = "${WORKDIR}/jsk_3rdparty-release-release-melodic-pgm_learner-2.1.12-2"

inherit catkin
