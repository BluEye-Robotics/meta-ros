DESCRIPTION = "The single joint position action is a node that provides an action interface for commanding a trajectory to move a joint to a particular position. The action reports success when the joint reaches the desired position."
AUTHOR = "Stuart Glaser"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp pr2-controllers-msgs actionlib roscpp pr2-controllers-msgs actionlib"

RDEPENDS_${PN} = "roscpp pr2-controllers-msgs actionlib"

SRC_URI = "https://github.com/pr2-gbp/pr2_controllers-release/archive/release/melodic/single_joint_position_action/1.10.15-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "500d58f09b1760dedc4beab99461e2df"
SRC_URI[sha256sum] = "52bd7e24d99be30953d7cf5ae23d1cd007b0863b86aa4dab5b3dcb741cca41a8"

ROS_SPN = "pr2_controllers"
S = "${WORKDIR}/pr2_controllers-release-release-melodic-single_joint_position_action-1.10.15-1"

inherit catkin
