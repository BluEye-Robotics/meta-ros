DESCRIPTION = "This package provides nodes that broadcast tf-frames along various (model-based) Cartesian paths (e. g. Linear, Circular). The tf-frames are interpolated using a given velocity profile (e. g. Ramp, Sinoid) and can be used as targets for the cob_frame_tracker/cob_twist_controller."
AUTHOR = "Christoph Mark"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "roslint message-generation actionlib-msgs actionlib boost cob-srvs geometry-msgs roscpp std-msgs std-srvs tf visualization-msgs"

RDEPENDS_${PN} = "message-runtime cob-frame-tracker cob-twist-controller robot-state-publisher rospy  topic-tools xacro"

SRC_URI = "https://github.com/ipa320/cob_control-release/archive/release/melodic/cob_cartesian_controller/0.8.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "eed78677d9cf3a25a19674bbdbfe3895"
SRC_URI[sha256sum] = "b075e089783d55f61a9c72abb5b79e8c0b61b6a04bd970356fc7f82d24b8ba37"

ROS_SPN = "cob_control"
S = "${WORKDIR}/cob_control-release-release-melodic-cob_cartesian_controller-0.8.0-1"

inherit catkin
