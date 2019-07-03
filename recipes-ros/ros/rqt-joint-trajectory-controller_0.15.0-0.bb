DESCRIPTION = "Graphical frontend for interacting with joint_trajectory_controller instances."
AUTHOR = "Adolfo Rodriguez Tsouroukdissian"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "control-msgs controller-manager-msgs trajectory-msgs rospy rqt-gui rqt-gui-py"

SRC_URI = "https://github.com/ros-gbp/ros_controllers-release/archive/release/melodic/rqt_joint_trajectory_controller/0.15.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "00b2c3428de28cfa463d07c12293e60f"
SRC_URI[sha256sum] = "469f85d30f031dece7a2077959de20084d813282ce05d007ba6296f991e68763"

ROS_SPN = "ros_controllers"
S = "${WORKDIR}/ros_controllers-release-release-melodic-rqt_joint_trajectory_controller-0.15.0-0"

inherit catkin
