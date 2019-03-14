DESCRIPTION = "Provides a cmake config for the default version of Gazebo for the ROS distribution."
AUTHOR = "Johannes Meyer"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "libgazebo9-dev"

RDEPENDS_${PN} = "gazebo9"

SRC_URI = "https://github.com/ros-gbp/gazebo_ros_pkgs-release/archive/release/melodic/gazebo_dev/2.8.4-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "213731e586ca2247a16e75287eb4acf6"
SRC_URI[sha256sum] = "8479a7d0ab9b939b03ad3f436e8bb3d6af22518143cdc51b822337941b1e62d5"

ROS_SPN = "gazebo_ros_pkgs"
S = "${WORKDIR}/gazebo_ros_pkgs-release-release-melodic-gazebo_dev-2.8.4-0"

inherit catkin
