DESCRIPTION = "A ROS wrapper of the AprilTag 3 visual fiducial detection algorithm. Provides full access to the core AprilTag 3 algorithm's customizations and makes the tag detection image and detected tags' poses available over ROS topics (including tf). The core AprilTag 3 algorithm is extended to allow the detection of tag bundles and a bundle calibration script is provided (bundle detection is more accurate than single tag detection). Continuous (camera image stream) and single image detector nodes are available."
AUTHOR = "Danylo Malyuta"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=21;endline=21;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "apriltag geometry-msgs image-transport image-geometry roscpp sensor-msgs message-generation std-msgs cv-bridge tf nodelet pluginlib libeigen opencv cmake-modules tf apriltag geometry-msgs image-transport image-geometry roscpp sensor-msgs message-runtime std-msgs cv-bridge nodelet pluginlib libeigen opencv"

RDEPENDS_${PN} = "tf apriltag geometry-msgs image-transport image-geometry roscpp sensor-msgs message-runtime std-msgs cv-bridge nodelet pluginlib libeigen opencv"

SRC_URI = "https://github.com/AprilRobotics/apriltag_ros-release/archive/release/melodic/apriltag_ros/3.1.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c6103f558e3312511138c3f8f04266d7"
SRC_URI[sha256sum] = "b206fdc20c059532c6333d15dbe9441f6788ea09629c0339972a7debaded96e6"

S = "${WORKDIR}/apriltag_ros-release-release-melodic-apriltag_ros-3.1.0-1"

inherit catkin
