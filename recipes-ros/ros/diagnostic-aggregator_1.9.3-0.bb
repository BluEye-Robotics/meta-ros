DESCRIPTION = "diagnostic_aggregator"
AUTHOR = "Kevin Watts"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "diagnostic-msgs pluginlib roscpp rospy rostest xmlrpcpp bondcpp bondpy diagnostic-msgs pluginlib roscpp rospy xmlrpcpp bondcpp bondpy"

RDEPENDS_${PN} = "diagnostic-msgs pluginlib roscpp rospy xmlrpcpp bondcpp bondpy"

SRC_URI = "https://github.com/ros-gbp/diagnostics-release/archive/release/melodic/diagnostic_aggregator/1.9.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "8121c9a25b0f99c6a8c0fd07d69a0f46"
SRC_URI[sha256sum] = "60f22960bd3056e62b0d354e4de2b80c3f5e377e31e330c91d82b0c4dcd8e70c"

ROS_SPN = "diagnostics"
S = "${WORKDIR}/diagnostics-release-release-melodic-diagnostic_aggregator-1.9.3-0"

inherit catkin
