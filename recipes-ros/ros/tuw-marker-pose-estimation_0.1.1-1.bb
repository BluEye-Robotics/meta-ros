DESCRIPTION = "This node does pose estimation for detected fiducials (marker_msgs/FiducialDetection. msg)"
AUTHOR = "Lukas Pfeifhofer"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp rospy std-msgs image-geometry tf cv-bridge marker-msgs dynamic-reconfigure roscpp rospy std-msgs image-geometry tf cv-bridge marker-msgs dynamic-reconfigure"

RDEPENDS_${PN} = "roscpp rospy std-msgs image-geometry tf cv-bridge marker-msgs dynamic-reconfigure"

SRC_URI = "https://github.com/tuw-robotics/tuw_marker_detection-release/archive/release/melodic/tuw_marker_pose_estimation/0.1.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a5ffa62b40166ae7bdeb00c7bfe43976"
SRC_URI[sha256sum] = "58ea5472112e231d213667c8977c5910de7398b71471b12a8a9e55dab48defd2"

ROS_SPN = "tuw_marker_detection"
S = "${WORKDIR}/tuw_marker_detection-release-release-melodic-tuw_marker_pose_estimation-0.1.1-1"

inherit catkin
