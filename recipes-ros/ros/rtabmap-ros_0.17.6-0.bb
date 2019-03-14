DESCRIPTION = "RTAB-Map's ros-pkg. RTAB-Map is a RGB-D SLAM approach with real-time constraints."
AUTHOR = "Mathieu Labbe"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cv-bridge roscpp rospy sensor-msgs std-msgs std-srvs nav-msgs stereo-msgs geometry-msgs visualization-msgs image-transport tf tf-conversions tf2-ros eigen-conversions laser-geometry pcl-conversions pcl-ros nodelet dynamic-reconfigure  message-filters class-loader rtabmap move-base-msgs costmap-2d octomap-msgs image-geometry find-object-2d message-generation pcl cv-bridge roscpp rospy sensor-msgs std-msgs std-srvs nav-msgs stereo-msgs geometry-msgs visualization-msgs image-transport compressed-depth-image-transport compressed-image-transport tf tf-conversions tf2-ros eigen-conversions laser-geometry pcl-conversions pcl-ros nodelet dynamic-reconfigure  message-filters class-loader rtabmap move-base-msgs costmap-2d octomap-msgs image-geometry find-object-2d message-runtime"

RDEPENDS_${PN} = "cv-bridge roscpp rospy sensor-msgs std-msgs std-srvs nav-msgs stereo-msgs geometry-msgs visualization-msgs image-transport compressed-depth-image-transport compressed-image-transport tf tf-conversions tf2-ros eigen-conversions laser-geometry pcl-conversions pcl-ros nodelet dynamic-reconfigure  message-filters class-loader rtabmap move-base-msgs costmap-2d octomap-msgs image-geometry find-object-2d message-runtime"

SRC_URI = "https://github.com/introlab/rtabmap_ros-release/archive/release/melodic/rtabmap_ros/0.17.6-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "fa3b3cd11942e35737972621f86557bd"
SRC_URI[sha256sum] = "6fe815c03b7ab3c27db125908e1206c537a46da0ff6266bb0263315833c81c6a"

S = "${WORKDIR}/rtabmap_ros-release-release-melodic-rtabmap_ros-0.17.6-0"

inherit catkin
