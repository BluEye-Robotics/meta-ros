DESCRIPTION = "A simple script that aggregates all of the topics that a "pr2_dashboard" app might be interested in."
AUTHOR = "Rob Wheeler"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rospy std-msgs pr2-msgs"

RDEPENDS_${PN} = "rospy std-msgs pr2-msgs"

SRC_URI = "https://github.com/pr2-gbp/pr2_common-release/archive/release/melodic/pr2_dashboard_aggregator/1.12.4-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "cee1392c0591e987e083101d3bc1a705"
SRC_URI[sha256sum] = "59e2885baab0aae9d693d4fc6b659a37b4f88ea3331f3e9c38c2e9cc22878576"

ROS_SPN = "pr2_common"
S = "${WORKDIR}/pr2_common-release-release-melodic-pr2_dashboard_aggregator-1.12.4-1"

inherit catkin
