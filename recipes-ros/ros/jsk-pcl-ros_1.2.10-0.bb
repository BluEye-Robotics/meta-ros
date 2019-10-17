DESCRIPTION = "ROS nodelets for pointcloud perception."
AUTHOR = "Yohei Kakiuchi"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cv-bridge image-geometry interactive-markers jsk-data jsk-pcl-ros-utils jsk-recognition-utils jsk-topic-tools laser-assembler moveit-ros-perception octomap-server pcl-msgs pcl-ros tf tf-conversions yaml-cpp boost checkerboard-detector cv-bridge diagnostic-msgs diagnostic-updater dynamic-reconfigure eigen-conversions geometry-msgs image-geometry image-transport image-view2 interactive-markers jsk-data jsk-footstep-msgs jsk-interactive-marker jsk-pcl-ros-utils jsk-recognition-msgs jsk-recognition-utils jsk-topic-tools kdl-conversions kdl-parser laser-assembler moveit-core moveit-ros-perception nav-msgs nodelet octomap octomap-server openni2-launch openni-launch pcl-conversions pcl-msgs pcl-ros python3-sklearn resized-image-transport robot-self-filter rosboost-cfg roscpp-tutorials sensor-msgs std-msgs std-srvs stereo-image-proc stereo-msgs tf2-ros tf tf-conversions topic-tools visualization-msgs yaml-cpp"

RDEPENDS_${PN} = "boost checkerboard-detector cv-bridge diagnostic-msgs diagnostic-updater dynamic-reconfigure eigen-conversions geometry-msgs image-geometry image-transport image-view2 interactive-markers jsk-data jsk-footstep-msgs jsk-interactive-marker jsk-pcl-ros-utils jsk-recognition-msgs jsk-recognition-utils jsk-topic-tools kdl-conversions kdl-parser laser-assembler moveit-core moveit-ros-perception nav-msgs nodelet octomap octomap-server openni2-launch openni-launch pcl-conversions pcl-msgs pcl-ros python3-sklearn resized-image-transport robot-self-filter rosboost-cfg roscpp-tutorials sensor-msgs std-msgs std-srvs stereo-image-proc stereo-msgs tf2-ros tf tf-conversions topic-tools visualization-msgs yaml-cpp"

SRC_URI = "https://github.com/tork-a/jsk_recognition-release/archive/release/melodic/jsk_pcl_ros/1.2.10-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a75c60291025cc7fddc6e45d76ac9e60"
SRC_URI[sha256sum] = "90d0c0bab294d0c49ab9228c91f887bd092f6400df9c1e37b834539159e2907f"

ROS_SPN = "jsk_recognition"
S = "${WORKDIR}/jsk_recognition-release-release-melodic-jsk_pcl_ros-1.2.10-0"

inherit catkin
