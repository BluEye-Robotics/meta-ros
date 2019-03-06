SRC_URI = "https://github.com/mavlink/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "60b26cafd38a7e60980a1fd3a7d1452a"
SRC_URI[sha256sum] = "fcc8171c004eca9b5eb4b3cb43f25ff5f553609bae4ad6f4e0a27181ff07f3f8"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "mavros"
