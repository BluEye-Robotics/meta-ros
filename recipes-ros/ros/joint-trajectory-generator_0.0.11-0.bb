DESCRIPTION = "joint_trajectory_generator action takes in a trajectory specified by a number of joint positions, and it generates a new smooth trajectory through these joint positions."
AUTHOR = "Eitan Marder-Eppstein"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib angles orocos-kdl joint-trajectory-action pr2-controllers-msgs roscpp urdf actionlib angles orocos-kdl joint-trajectory-action pr2-controllers-msgs roscpp urdf"

RDEPENDS_${PN} = "actionlib angles orocos-kdl joint-trajectory-action pr2-controllers-msgs roscpp urdf"

SRC_URI = "https://github.com/pr2-gbp/pr2_common_actions-release/archive/release/melodic/joint_trajectory_generator/0.0.11-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "cc49c3cd841e51d630b60b593b83e897"
SRC_URI[sha256sum] = "273943f65776908254c198a36be8792716e78e5487d52e849be32aa66094695d"

ROS_SPN = "pr2_common_actions"
S = "${WORKDIR}/pr2_common_actions-release-release-melodic-joint_trajectory_generator-0.0.11-0"

inherit catkin
