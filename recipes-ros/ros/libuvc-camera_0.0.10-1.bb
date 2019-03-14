DESCRIPTION = "USB Video Class camera driver"
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp camera-info-manager dynamic-reconfigure image-transport libuvc nodelet sensor-msgs roscpp camera-info-manager dynamic-reconfigure image-transport libuvc nodelet sensor-msgs"

RDEPENDS_${PN} = "roscpp camera-info-manager dynamic-reconfigure image-transport libuvc nodelet sensor-msgs"

SRC_URI = "https://github.com/ros-drivers-gbp/libuvc_ros-release/archive/release/melodic/libuvc_camera/0.0.10-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "ac238971affc3f251ef4054431996e78"
SRC_URI[sha256sum] = "2ea19c5821e70fe6c63da750b35c6ae0dfff43faadca9f951c0137e5701834b0"

ROS_SPN = "libuvc_ros"
S = "${WORKDIR}/libuvc_ros-release-release-melodic-libuvc_camera-0.0.10-1"

inherit catkin
