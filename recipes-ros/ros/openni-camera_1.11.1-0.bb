DESCRIPTION = "A ROS driver for OpenNI depth (+ RGB) cameras. These include: Microsoft Kinect, PrimeSense PSDK, ASUS Xtion Pro and Pro Live The driver publishes raw depth, RGB, and IR image streams."
AUTHOR = "Patrick Mihelich"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "camera-info-manager dynamic-reconfigure image-transport log4cxx nodelet roscpp sensor-msgs libusb-1.0-dev libopenni-dev camera-info-manager dynamic-reconfigure image-transport log4cxx nodelet roscpp sensor-msgs libusb-1.0-dev libopenni-dev"

RDEPENDS_${PN} = "camera-info-manager dynamic-reconfigure image-transport log4cxx nodelet roscpp sensor-msgs libusb-1.0-dev libopenni-dev"

SRC_URI = "https://github.com/ros-gbp/openni_camera-release/archive/release/melodic/openni_camera/1.11.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a74a7949a861dc26e3bb7e0ddb81e055"
SRC_URI[sha256sum] = "0efa907d200aa0506d664882b0083f992ee2855b36d890c7b334bdc3a5241e2e"

S = "${WORKDIR}/openni_camera-release-release-melodic-openni_camera-1.11.1-0"

inherit catkin
