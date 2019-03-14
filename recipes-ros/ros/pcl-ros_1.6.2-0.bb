DESCRIPTION = "PCL (Point Cloud Library) ROS interface stack. PCL-ROS is the preferred bridge for 3D applications involving n-D Point Clouds and 3D geometry processing in ROS."
AUTHOR = "Open Perception"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=20;endline=20;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cmake-modules rosconsole roslib dynamic-reconfigure libeigen message-filters nodelet nodelet-topic-tools pcl pcl-conversions pcl-msgs pluginlib rosbag roscpp sensor-msgs std-msgs tf tf2-eigen"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/perception_pcl-release/archive/release/melodic/pcl_ros/1.6.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c98c1f93b9a8b343a3fcd34da718400a"
SRC_URI[sha256sum] = "deb1b59fcc5f3f9247e9fa90e7f5bde35d22668aa13a9300a4d6d3315552215e"

ROS_SPN = "perception_pcl"
S = "${WORKDIR}/perception_pcl-release-release-melodic-pcl_ros-1.6.2-0"

inherit catkin
