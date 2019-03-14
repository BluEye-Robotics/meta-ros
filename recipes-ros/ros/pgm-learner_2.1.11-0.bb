DESCRIPTION = "Parameter/Structure Estimation and Inference for Bayesian Belief Network"
AUTHOR = "Yuki Furuta"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "rospy python-scipy message-generation python-libpgm-pip rospy python-scipy message-runtime"

RDEPENDS_${PN} = "python-libpgm-pip rospy python-scipy message-runtime"

SRC_URI = "https://github.com/tork-a/jsk_3rdparty-release/archive/release/melodic/pgm_learner/2.1.11-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "b7a61bcfd1d278852641bc1fcad73b0a"
SRC_URI[sha256sum] = "8b10c7b2da1c40d20df932f2e2776d1a707c24d52c2c9e5289e2f54fdd4e8e0f"

ROS_SPN = "jsk_3rdparty"
S = "${WORKDIR}/jsk_3rdparty-release-release-melodic-pgm_learner-2.1.11-0"

inherit catkin
