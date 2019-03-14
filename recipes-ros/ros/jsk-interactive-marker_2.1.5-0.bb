DESCRIPTION = "jsk interactive markers"
AUTHOR = "furuta"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "mk rosbuild roseus visualization-msgs geometry-msgs sensor-msgs dynamic-tf-publisher dynamic-reconfigure interactive-markers urdf tf jsk-footstep-msgs actionlib eigen-conversions tf-conversions libtinyxml cmake-modules roscpp roslib message-filters message-generation jsk-rviz-plugins moveit-msgs jsk-recognition-msgs jsk-recognition-utils jsk-topic-tools yaml-cpp  message-runtime roseus libtinyxml geometry-msgs visualization-msgs sensor-msgs dynamic-tf-publisher dynamic-reconfigure interactive-markers urdf tf jsk-footstep-msgs actionlib eigen-conversions tf-conversions roscpp roslib message-filters jsk-rviz-plugins jsk-topic-tools jsk-recognition-msgs jsk-recognition-utils yaml-cpp moveit-msgs"

RDEPENDS_${PN} = "message-runtime roseus libtinyxml geometry-msgs visualization-msgs sensor-msgs dynamic-tf-publisher dynamic-reconfigure interactive-markers urdf tf jsk-footstep-msgs actionlib eigen-conversions tf-conversions roscpp roslib message-filters jsk-rviz-plugins jsk-topic-tools jsk-recognition-msgs jsk-recognition-utils yaml-cpp moveit-msgs"

SRC_URI = "https://github.com/tork-a/jsk_visualization-release/archive/release/melodic/jsk_interactive_marker/2.1.5-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "4aa0a944aac8be2646d0f08d21e387d4"
SRC_URI[sha256sum] = "9d011fe79c6eda3b54a31289ca6fa2073bd601771d4a788195992a87741f3a9a"

ROS_SPN = "jsk_visualization"
S = "${WORKDIR}/jsk_visualization-release-release-melodic-jsk_interactive_marker-2.1.5-0"

inherit catkin
