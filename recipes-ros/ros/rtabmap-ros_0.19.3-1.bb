DESCRIPTION = "RTAB-Map's ros-pkg. RTAB-Map is a RGB-D SLAM approach with real-time constraints."
AUTHOR = "Mathieu Labbe"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cv-bridge roscpp rospy sensor-msgs std-msgs std-srvs nav-msgs stereo-msgs geometry-msgs visualization-msgs rosgraph-msgs image-transport tf tf-conversions tf2-ros eigen-conversions laser-geometry pcl-conversions pcl-ros nodelet dynamic-reconfigure  message-filters class-loader rtabmap move-base-msgs costmap-2d octomap-msgs image-geometry find-object-2d message-generation pcl cv-bridge roscpp rospy sensor-msgs std-msgs std-srvs nav-msgs stereo-msgs geometry-msgs visualization-msgs rosgraph-msgs image-transport compressed-depth-image-transport compressed-image-transport tf tf-conversions tf2-ros eigen-conversions laser-geometry pcl-conversions pcl-ros nodelet dynamic-reconfigure  message-filters class-loader rtabmap move-base-msgs costmap-2d octomap-msgs image-geometry find-object-2d message-runtime"

RDEPENDS_${PN} = "cv-bridge roscpp rospy sensor-msgs std-msgs std-srvs nav-msgs stereo-msgs geometry-msgs visualization-msgs rosgraph-msgs image-transport compressed-depth-image-transport compressed-image-transport tf tf-conversions tf2-ros eigen-conversions laser-geometry pcl-conversions pcl-ros nodelet dynamic-reconfigure  message-filters class-loader rtabmap move-base-msgs costmap-2d octomap-msgs image-geometry find-object-2d message-runtime"

SRC_URI = "https://github.com/introlab/rtabmap_ros-release/archive/release/melodic/rtabmap_ros/0.19.3-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "cdf84ca50ec55b9794dede5b1cd2a22b"
SRC_URI[sha256sum] = "5d5099589b46f8aec805e0f7b194b7d6a87960778034d3893347e0ec3b078ef8"

S = "${WORKDIR}/rtabmap_ros-release-release-melodic-rtabmap_ros-0.19.3-1"

inherit catkin
