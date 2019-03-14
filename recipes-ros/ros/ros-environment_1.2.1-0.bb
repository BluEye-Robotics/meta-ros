DESCRIPTION = "The package provides the environment variables `ROS_VERSION`, `ROS_DISTRO`, `ROS_PACKAGE_PATH`, and `ROS_ETC_DIR`."
AUTHOR = ""
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = ""

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/ros_environment-release/archive/release/melodic/ros_environment/1.2.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "37822c8c4f58086a6876b22b8f4ea3ed"
SRC_URI[sha256sum] = "2bb4a8d5947bd81fb1b6f7b1e9e822e69ccf99bec2cca7a68fd654017e69993f"

S = "${WORKDIR}/ros_environment-release-release-melodic-ros_environment-1.2.1-0"

inherit catkin
