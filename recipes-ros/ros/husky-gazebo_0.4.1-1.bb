DESCRIPTION = "Clearpath Husky Simulator bringup"
AUTHOR = "Ryan Gariepy"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roslaunch controller-manager gazebo-plugins gazebo-ros gazebo-ros-control hector-gazebo-plugins husky-control husky-description multimaster-launch pointcloud-to-laserscan rostopic"

RDEPENDS_${PN} = "controller-manager gazebo-plugins gazebo-ros gazebo-ros-control hector-gazebo-plugins husky-control husky-description multimaster-launch pointcloud-to-laserscan rostopic"

SRC_URI = "https://github.com/clearpath-gbp/husky-release/archive/release/melodic/husky_gazebo/0.4.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "54eb14a900cd2ca8b78054738d79c4d1"
SRC_URI[sha256sum] = "f8001d977d7740b7401878c8372438101e9669c9111838380973a41ede2bb4cf"

ROS_SPN = "husky"
S = "${WORKDIR}/husky-release-release-melodic-husky_gazebo-0.4.1-1"

inherit catkin
