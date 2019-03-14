DESCRIPTION = "ROS utility nodelets for pointcloud perception."
AUTHOR = "Yohei Kakiuchi"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "pcl-ros pcl-msgs cv-bridge tf sensor-msgs geometry-msgs stereo-msgs nodelet eigen-conversions tf-conversions tf2-ros pcl-conversions dynamic-reconfigure std-srvs std-msgs image-transport image-geometry image-view2 message-generation visualization-msgs boost rosboost-cfg cv-bridge diagnostic-updater diagnostic-msgs jsk-topic-tools roscpp-tutorials jsk-data jsk-footstep-msgs jsk-recognition-utils robot-self-filter kdl-parser kdl-conversions nav-msgs octomap octomap-server octomap-msgs octomap-ros laser-assembler moveit-ros-perception moveit-core yaml-cpp jsk-recognition-msgs interactive-markers roscpp-tutorials jsk-topic-tools eigen-conversions tf-conversions tf2-ros pcl-conversions pcl-ros pcl-msgs cv-bridge tf sensor-msgs geometry-msgs stereo-msgs nodelet dynamic-reconfigure std-srvs std-msgs image-transport compressed-image-transport compressed-depth-image-transport image-geometry image-view image-view2 message-runtime visualization-msgs boost rosboost-cfg  cv-bridge diagnostic-updater diagnostic-msgs python-sklearn laser-assembler moveit-ros-perception moveit-core yaml-cpp jsk-recognition-msgs jsk-data jsk-footstep-msgs interactive-markers jsk-recognition-utils robot-self-filter kdl-parser kdl-conversions nav-msgs octomap octomap-server octomap-msgs octomap-ros openni2-launch rosbag"

RDEPENDS_${PN} = "roscpp-tutorials jsk-topic-tools eigen-conversions tf-conversions tf2-ros pcl-conversions pcl-ros pcl-msgs cv-bridge tf sensor-msgs geometry-msgs stereo-msgs nodelet dynamic-reconfigure std-srvs std-msgs image-transport compressed-image-transport compressed-depth-image-transport image-geometry image-view image-view2 message-runtime visualization-msgs boost rosboost-cfg  cv-bridge diagnostic-updater diagnostic-msgs python-sklearn laser-assembler moveit-ros-perception moveit-core yaml-cpp jsk-recognition-msgs jsk-data jsk-footstep-msgs interactive-markers jsk-recognition-utils robot-self-filter kdl-parser kdl-conversions nav-msgs octomap octomap-server octomap-msgs octomap-ros openni2-launch rosbag"

SRC_URI = "https://github.com/tork-a/jsk_recognition-release/archive/release/melodic/jsk_pcl_ros_utils/1.2.9-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "47f14d4a6a34099ff093d2a33a96fd11"
SRC_URI[sha256sum] = "cd0eda9aae1b4aee9048558c6d20dd90517c1a8c789af297fa91e49f253b5418"

ROS_SPN = "jsk_recognition"
S = "${WORKDIR}/jsk_recognition-release-release-melodic-jsk_pcl_ros_utils-1.2.9-0"

inherit catkin
