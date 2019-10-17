DESCRIPTION = "The single joint position action is a node that provides an action interface for commanding a trajectory to move a joint to a particular position. The action reports success when the joint reaches the desired position."
AUTHOR = "Stuart Glaser"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp pr2-controllers-msgs actionlib roscpp pr2-controllers-msgs actionlib"

RDEPENDS_${PN} = "roscpp pr2-controllers-msgs actionlib"

SRC_URI = "https://github.com/pr2-gbp/pr2_controllers-release/archive/release/melodic/single_joint_position_action/1.10.17-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "6d88a6a189375e2627fa88ed470e7084"
SRC_URI[sha256sum] = "f7761a78b2539d7cc7f01ad00d85cb426c9b57b8b696cf41d8a98e00192fb1bc"

ROS_SPN = "pr2_controllers"
S = "${WORKDIR}/pr2_controllers-release-release-melodic-single_joint_position_action-1.10.17-1"

inherit catkin
