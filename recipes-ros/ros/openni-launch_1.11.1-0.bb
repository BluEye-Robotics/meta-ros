DESCRIPTION = "Launch files to open an OpenNI device and load all nodelets to convert raw depth/RGB/IR streams to depth images, disparity images, and (registered) point clouds."
AUTHOR = "Patrick Mihelich"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roslaunch nodelet openni-camera rgbd-launch"

RDEPENDS_${PN} = "nodelet openni-camera rgbd-launch"

SRC_URI = "https://github.com/ros-gbp/openni_camera-release/archive/release/melodic/openni_launch/1.11.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "b7325fa2fbcbac03132aca6ab1d99872"
SRC_URI[sha256sum] = "0c4aa79a977973fc48b0c8a829358367a3ef095a8d93323eeee1972c5c8d3806"

ROS_SPN = "openni_camera"
S = "${WORKDIR}/openni_camera-release-release-melodic-openni_launch-1.11.1-0"

inherit catkin
