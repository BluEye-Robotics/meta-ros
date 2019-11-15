DESCRIPTION = "A node that provides the move_base action server interface, but instead of planning simply drives towards the target pose using a control-based approach."
AUTHOR = "Eitan Marder-Eppstein"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib geometry-msgs move-base-msgs nav-msgs roscpp tf2-geometry-msgs tf2-ros"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/navigation_experimental-release/archive/release/melodic/pose_base_controller/0.3.3-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e7d00ed2892fecf414aab0637904cf4b"
SRC_URI[sha256sum] = "b18cf02ddbaaa806e9f580e6051492c37a21112cf46394a67ecbc3a150278242"

ROS_SPN = "navigation_experimental"
S = "${WORKDIR}/navigation_experimental-release-release-melodic-pose_base_controller-0.3.3-1"

inherit catkin
