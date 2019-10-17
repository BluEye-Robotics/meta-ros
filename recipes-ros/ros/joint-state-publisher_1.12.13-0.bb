DESCRIPTION = "This package contains a tool for setting and publishing joint state values for a given URDF."
AUTHOR = "David V. Lu!!"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "rospy python3-pyqt5 sensor-msgs"

SRC_URI = "https://github.com/ros-gbp/joint_state_publisher-release/archive/release/melodic/joint_state_publisher/1.12.13-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "03a430da345c60bbb7fc3c659c8a6380"
SRC_URI[sha256sum] = "47bcd5c3c46ffd2d73ee0910bf584a3a23be56e2e423f3849b8771e55fe6fe8e"

S = "${WORKDIR}/joint_state_publisher-release-release-melodic-joint_state_publisher-1.12.13-0"

inherit catkin
