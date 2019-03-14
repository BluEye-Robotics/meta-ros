DESCRIPTION = "URDF description of the robot kinematics and dynamics, 3D models of robot components, information required for gazebo to simulate the PR2, and messages specific to the PR2 such as detailed information about its power board and fingertip pressure sensors."
AUTHOR = "John Hsu"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "pr2-msgs pr2-dashboard-aggregator pr2-description pr2-machine"

RDEPENDS_${PN} = "pr2-msgs pr2-dashboard-aggregator pr2-description pr2-machine"

SRC_URI = "https://github.com/pr2-gbp/pr2_common-release/archive/release/melodic/pr2_common/1.12.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e41bbc6a7d62cf96404eabbd87b11c90"
SRC_URI[sha256sum] = "0b6419b86aa4b12d30fa7b1569899a5dc61bcd78a19049a0a7d23e15d1a1a0a9"

S = "${WORKDIR}/pr2_common-release-release-melodic-pr2_common-1.12.3-0"

inherit catkin
