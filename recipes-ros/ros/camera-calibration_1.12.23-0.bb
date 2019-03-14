DESCRIPTION = "camera_calibration allows easy calibration of monocular or stereo cameras using a checkerboard calibration target."
AUTHOR = "James Bowman"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=23;endline=23;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cv-bridge image-geometry message-filters rospy std-srvs sensor-msgs"

RDEPENDS_${PN} = "cv-bridge image-geometry message-filters rospy std-srvs sensor-msgs"

SRC_URI = "https://github.com/ros-gbp/image_pipeline-release/archive/release/melodic/camera_calibration/1.12.23-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "9d43a7f32c9033c0b45ce61eb717b126"
SRC_URI[sha256sum] = "12493d808dd8edcdfa7e569b70cd8be685c22df027f8dc0fabe6d56ed25e2586"

ROS_SPN = "image_pipeline"
S = "${WORKDIR}/image_pipeline-release-release-melodic-camera_calibration-1.12.23-0"

inherit catkin
