DESCRIPTION = "Message and service data structures for interacting with Gazebo from ROS."
AUTHOR = "John Hsu"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "geometry-msgs sensor-msgs trajectory-msgs std-msgs std-srvs message-generation"

RDEPENDS_${PN} = "geometry-msgs sensor-msgs trajectory-msgs std-msgs message-runtime std-srvs"

SRC_URI = "https://github.com/ros-gbp/gazebo_ros_pkgs-release/archive/release/melodic/gazebo_msgs/2.8.4-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "40fb398685edc28165ac7e4e16e6cdbb"
SRC_URI[sha256sum] = "e0b6c175c51d3fcbe4a2c3143a70a3fc6a209c922c811159a2d5b1922db72426"

ROS_SPN = "gazebo_ros_pkgs"
S = "${WORKDIR}/gazebo_ros_pkgs-release-release-melodic-gazebo_msgs-2.8.4-0"

inherit catkin
