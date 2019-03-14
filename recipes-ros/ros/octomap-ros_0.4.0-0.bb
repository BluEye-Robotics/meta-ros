DESCRIPTION = "octomap_ros provides conversion functions between ROS and OctoMap's native types. This enables a convenvient use of the octomap package in ROS."
AUTHOR = "Armin Hornung"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin octomap-msgs octomap sensor-msgs tf octomap-msgs octomap sensor-msgs tf"

RDEPENDS_${PN} = "octomap-msgs octomap sensor-msgs tf"

SRC_URI = "https://github.com/ros-gbp/octomap_ros-release/archive/release/melodic/octomap_ros/0.4.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "21059dd71d5b3e891df42d2e56fe10ec"
SRC_URI[sha256sum] = "50dca555a5c7883b74068ae676db17671fa15da854f2985ed4999feff70089fd"

S = "${WORKDIR}/octomap_ros-release-release-melodic-octomap_ros-0.4.0-0"

inherit catkin
