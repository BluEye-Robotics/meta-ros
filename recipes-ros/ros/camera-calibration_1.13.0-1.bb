DESCRIPTION = "camera_calibration allows easy calibration of monocular or stereo cameras using a checkerboard calibration target."
AUTHOR = "James Bowman"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=25;endline=25;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cv-bridge image-geometry message-filters rospy std-srvs sensor-msgs"

RDEPENDS_${PN} = "cv-bridge image-geometry message-filters rospy std-srvs sensor-msgs"

SRC_URI = "https://github.com/ros-gbp/image_pipeline-release/archive/release/melodic/camera_calibration/1.13.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "309942d7056ef17d4020940eb4fc48ce"
SRC_URI[sha256sum] = "5577d92469b4793887ee0b8496c46dcd0c83e53bf1eab4d33bad51d598e65cfc"

ROS_SPN = "image_pipeline"
S = "${WORKDIR}/image_pipeline-release-release-melodic-camera_calibration-1.13.0-1"

inherit catkin
