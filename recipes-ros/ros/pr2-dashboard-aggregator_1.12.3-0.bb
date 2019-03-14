DESCRIPTION = "A simple script that aggregates all of the topics that a "pr2_dashboard" app might be interested in."
AUTHOR = "Rob Wheeler"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rospy std-msgs pr2-msgs"

RDEPENDS_${PN} = "rospy std-msgs pr2-msgs"

SRC_URI = "https://github.com/pr2-gbp/pr2_common-release/archive/release/melodic/pr2_dashboard_aggregator/1.12.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "dec87d62dd0955010c010b18a2edbed6"
SRC_URI[sha256sum] = "50c10a982c9d7fe6b1d6f64f73bcdaa207b5a8f76ddd867ff146114e1ba020c4"

ROS_SPN = "pr2_common"
S = "${WORKDIR}/pr2_common-release-release-melodic-pr2_dashboard_aggregator-1.12.3-0"

inherit catkin
