DESCRIPTION = "Interface for enforcing joint limits."
AUTHOR = "Adolfo Rodriguez Tsouroukdissian"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp hardware-interface urdf urdfdom"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/ros_control-release/archive/release/melodic/joint_limits_interface/0.15.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f2f33591279f22adb36e6b3fa2e83929"
SRC_URI[sha256sum] = "c79c7fa6eaa2ccb35ed79b7dc6b125db16a98d298085a1fb1a2ed530e9817a64"

ROS_SPN = "ros_control"
S = "${WORKDIR}/ros_control-release-release-melodic-joint_limits_interface-0.15.1-0"

inherit catkin
