DESCRIPTION = "Tucks the arms of the PR2 robot into a safe position for moving the base of the robot. This also moves the arms out of the view of the tilting laser scanner, as much as possible."
AUTHOR = "Wim Meeussen"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rospy trajectory-msgs pr2-mechanism-msgs pr2-tuck-arms-action"

RDEPENDS_${PN} = "rospy trajectory-msgs pr2-mechanism-msgs pr2-tuck-arms-action"

SRC_URI = "https://github.com/pr2-gbp/pr2_apps-release/archive/release/melodic/pr2_tuckarm/0.6.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "6fa05a59c5c33e1e9da0ced8eaa74380"
SRC_URI[sha256sum] = "b03495a901d77fa4ed63ddd47ac3d1000dd43d7458eceeb5910f4c989397ee30"

ROS_SPN = "pr2_apps"
S = "${WORKDIR}/pr2_apps-release-release-melodic-pr2_tuckarm-0.6.1-0"

inherit catkin
