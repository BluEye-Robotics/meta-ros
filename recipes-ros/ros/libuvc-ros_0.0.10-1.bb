DESCRIPTION = "libuvc_ros metapackage"
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "libuvc-camera"

RDEPENDS_${PN} = "libuvc-camera"

SRC_URI = "https://github.com/ros-drivers-gbp/libuvc_ros-release/archive/release/melodic/libuvc_ros/0.0.10-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "dbde62a40d138087994cf65c1c303354"
SRC_URI[sha256sum] = "bcf16c5e63589493b35241bb6b6a8826db8b816d5966cc696e3c85f111339a0f"

S = "${WORKDIR}/libuvc_ros-release-release-melodic-libuvc_ros-0.0.10-1"

inherit catkin
