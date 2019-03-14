DESCRIPTION = "Basic diagnostic_aggregator tests are in the"
AUTHOR = "Kevin Watts"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "diagnostic-aggregator diagnostic-msgs pluginlib roscpp rospy rostest diagnostic-aggregator diagnostic-msgs pluginlib roscpp rospy"

RDEPENDS_${PN} = "diagnostic-aggregator diagnostic-msgs pluginlib roscpp rospy"

SRC_URI = "https://github.com/ros-gbp/diagnostics-release/archive/release/melodic/test_diagnostic_aggregator/1.9.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "3fdac5f1a2d26f9651e7b42b9d78b704"
SRC_URI[sha256sum] = "4c49680ea5fe2d6e4c792d09848623c3b0206126ad171c4b4dd61f400c9abfe3"

ROS_SPN = "diagnostics"
S = "${WORKDIR}/diagnostics-release-release-melodic-test_diagnostic_aggregator-1.9.3-0"

inherit catkin
