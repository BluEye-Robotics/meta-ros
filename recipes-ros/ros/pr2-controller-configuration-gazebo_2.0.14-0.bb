DESCRIPTION = "A copy of the pr2_controller_configuration package, for use in the PR2 simulator. We maintain two copies to allow for controller gains to be set differently between hardware and simulation."
AUTHOR = "Wim Meeussen, John Hsu"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "gazebo pr2-controller-manager single-joint-position-action pr2-head-action pr2-gripper-action"

RDEPENDS_${PN} = "gazebo pr2-controller-manager single-joint-position-action pr2-head-action pr2-gripper-action"

SRC_URI = "https://github.com/pr2-gbp/pr2_simulator-release/archive/release/melodic/pr2_controller_configuration_gazebo/2.0.14-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "0a61e1293852f693f6ea6403d17a8b1f"
SRC_URI[sha256sum] = "5c439cea522e3fdbd04cb520d3adb886513eff5a52619491b6a2f4e3d84f38fb"

ROS_SPN = "pr2_simulator"
S = "${WORKDIR}/pr2_simulator-release-release-melodic-pr2_controller_configuration_gazebo-2.0.14-0"

inherit catkin
