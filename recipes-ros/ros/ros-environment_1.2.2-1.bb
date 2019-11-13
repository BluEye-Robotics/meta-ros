DESCRIPTION = "The package provides the environment variables `ROS_VERSION`, `ROS_DISTRO`, `ROS_PACKAGE_PATH`, and `ROS_ETC_DIR`."
AUTHOR = ""
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = ""

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/ros_environment-release/archive/release/melodic/ros_environment/1.2.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e52905c1b1814bffd80738e14744a38c"
SRC_URI[sha256sum] = "928aa91623553711b5e51dafc1271717e7d69ad0bd202a42309100c25721d53a"

S = "${WORKDIR}/ros_environment-release-release-melodic-ros_environment-1.2.2-1"

inherit catkin
