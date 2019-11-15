DESCRIPTION = "This package provides nodes that broadcast tf-frames along various (model-based) Cartesian paths (e. g. Linear, Circular). The tf-frames are interpolated using a given velocity profile (e. g. Ramp, Sinoid) and can be used as targets for the cob_frame_tracker/cob_twist_controller."
AUTHOR = "Christoph Mark"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "roslint message-generation actionlib-msgs actionlib boost cob-srvs geometry-msgs roscpp std-msgs std-srvs tf visualization-msgs"

RDEPENDS_${PN} = "message-runtime cob-frame-tracker cob-twist-controller robot-state-publisher rospy  topic-tools xacro"

SRC_URI = "https://github.com/ipa320/cob_control-release/archive/release/melodic/cob_cartesian_controller/0.8.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d3680e8e434f155d6be9fd9bbd1288f1"
SRC_URI[sha256sum] = "676934ceb346e29f9fd3c43c8e12460d7479a56ecdf3608fefd198b201e08e44"

ROS_SPN = "cob_control"
S = "${WORKDIR}/cob_control-release-release-melodic-cob_cartesian_controller-0.8.1-1"

inherit catkin
