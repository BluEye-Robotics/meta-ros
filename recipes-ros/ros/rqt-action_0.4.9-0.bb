DESCRIPTION = "rqt_action provides a feature to introspect all available ROS action (from actionlib) types. By utilizing rqt_msg, the output format is unified with it and rqt_srv. Note that the actions shown on this plugin is the ones that are stored on your machine, not on the ROS core your rqt instance connects to."
AUTHOR = "Isaac Isao Saito"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rospy rqt-msg rqt-py-common"

RDEPENDS_${PN} = "rospy rqt-msg rqt-py-common"

SRC_URI = "https://github.com/ros-gbp/rqt_action-release/archive/release/melodic/rqt_action/0.4.9-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f86fdfcc836a16e0b304457cb99ee7f6"
SRC_URI[sha256sum] = "5ac33f2d857d43c2c79f82f73070f6dec9bf326ea6bc0b3bce4e49c3d5b8c7d8"

S = "${WORKDIR}/rqt_action-release-release-melodic-rqt_action-0.4.9-0"

inherit catkin
