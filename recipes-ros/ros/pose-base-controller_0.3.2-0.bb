DESCRIPTION = "A node that provides the move_base action server interface, but instead of planning simply drives towards the target pose using a control-based approach."
AUTHOR = "Eitan Marder-Eppstein"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib geometry-msgs move-base-msgs nav-msgs roscpp tf2-geometry-msgs tf2-ros"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/navigation_experimental-release/archive/release/melodic/pose_base_controller/0.3.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "55b85d698696a5e8d281eaa7dc3e0899"
SRC_URI[sha256sum] = "92fdd5e9e92e018a8ecbb45cf342f449ad33550922b7b9de82b27c54c131af48"

ROS_SPN = "navigation_experimental"
S = "${WORKDIR}/navigation_experimental-release-release-melodic-pose_base_controller-0.3.2-0"

inherit catkin
