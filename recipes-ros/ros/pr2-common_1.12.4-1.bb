DESCRIPTION = "URDF description of the robot kinematics and dynamics, 3D models of robot components, information required for gazebo to simulate the PR2, and messages specific to the PR2 such as detailed information about its power board and fingertip pressure sensors."
AUTHOR = "John Hsu"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "pr2-msgs pr2-dashboard-aggregator pr2-description pr2-machine"

RDEPENDS_${PN} = "pr2-msgs pr2-dashboard-aggregator pr2-description pr2-machine"

SRC_URI = "https://github.com/pr2-gbp/pr2_common-release/archive/release/melodic/pr2_common/1.12.4-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "891f074ea9068dd33eff109a4d5e06df"
SRC_URI[sha256sum] = "a079541b7d696b2a3755aaef63c34e720a67d9c5700fa0acc3a9fa9167745283"

S = "${WORKDIR}/pr2_common-release-release-melodic-pr2_common-1.12.4-1"

inherit catkin
