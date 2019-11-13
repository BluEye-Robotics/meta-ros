DESCRIPTION = "A ROS wrapper of the AprilTag 3 visual fiducial detection algorithm. Provides full access to the core AprilTag 3 algorithm's customizations and makes the tag detection image and detected tags' poses available over ROS topics (including tf). The core AprilTag 3 algorithm is extended to allow the detection of tag bundles and a bundle calibration script is provided (bundle detection is more accurate than single tag detection). Continuous (camera image stream) and single image detector nodes are available."
AUTHOR = "Danylo Malyuta"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=21;endline=21;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "apriltag geometry-msgs image-transport image-geometry roscpp sensor-msgs message-generation std-msgs cv-bridge tf nodelet pluginlib libeigen opencv cmake-modules tf apriltag geometry-msgs image-transport image-geometry roscpp sensor-msgs message-runtime std-msgs cv-bridge nodelet pluginlib libeigen opencv"

RDEPENDS_${PN} = "tf apriltag geometry-msgs image-transport image-geometry roscpp sensor-msgs message-runtime std-msgs cv-bridge nodelet pluginlib libeigen opencv"

SRC_URI = "https://github.com/AprilRobotics/apriltag_ros-release/archive/release/melodic/apriltag_ros/3.1.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "621a1b1a6208fb7578ea9a0e42c517aa"
SRC_URI[sha256sum] = "a703b93d69b4451a75acd90076aed64ca7eabe84e88eda2dc798b532de39fb52"

S = "${WORKDIR}/apriltag_ros-release-release-melodic-apriltag_ros-3.1.1-1"

inherit catkin
