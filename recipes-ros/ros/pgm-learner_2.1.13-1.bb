DESCRIPTION = "Parameter/Structure Estimation and Inference for Bayesian Belief Network"
AUTHOR = "Yuki Furuta"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "rospy python-scipy message-generation python-libpgm-pip rospy python-scipy message-runtime"

RDEPENDS_${PN} = "python-libpgm-pip rospy python-scipy message-runtime"

SRC_URI = "https://github.com/tork-a/jsk_3rdparty-release/archive/release/melodic/pgm_learner/2.1.13-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c51f5c1fb0ba0be8f4ca57fd9d4b6931"
SRC_URI[sha256sum] = "d4aa36d9230b2fa9481c4ad271572cd648e99a1abdc50765ba1539739f45a981"

ROS_SPN = "jsk_3rdparty"
S = "${WORKDIR}/jsk_3rdparty-release-release-melodic-pgm_learner-2.1.13-1"

inherit catkin
